import { Component, OnInit } from '@angular/core';
import { PaginationModel } from 'src/app/shared/models/pagination-model';
import { RecordModel } from 'src/app/shared/models/records-model';
import { RecordsService } from 'src/app/shared/services/records.service';

@Component({
  selector: 'app-records',
  templateUrl: './records.component.html',
  styleUrls: ['./records.component.css']
})
export class RecordsComponent implements OnInit {

  records: Array<RecordModel>;
  activePage: Number = 0;
  totalPages: Number;
  handlePageChange: Function;

  constructor(private recordService: RecordsService) {
    this.getRecordsFromPage(this.activePage);

    this.handlePageChange = (index: number) => {
      this.activePage = index;
      this.getRecordsFromPage(this.activePage);
    }
  }

  getRecordsFromPage(actualPage) {
    this.recordService.getRecords(actualPage).subscribe(record => {
      this.totalPages = record.totalPages;
      this.records = record.content;
    });
  }



  ngOnInit(): void {
  }



}
