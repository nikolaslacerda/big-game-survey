import { Component, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-pagination',
  templateUrl: './pagination.component.html',
  styleUrls: ['./pagination.component.css']
})
export class PaginationComponent implements OnChanges {

  @Input() totalPages: number = 1;
  @Input() goToPage: Function;
  @Input() activePage: number;
  paginationItems: number[];

  constructor() {
    this.paginationItems = Array.from(Array(this.totalPages).keys());
   }

  ngOnChanges(changes: SimpleChanges): void {
    this.paginationItems = Array.from(Array(this.totalPages).keys());
  }


}
