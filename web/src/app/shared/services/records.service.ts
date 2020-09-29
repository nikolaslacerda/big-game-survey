import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { RecordModel } from '../models/records-model';
import { PaginationModel } from '../models/pagination-model';

@Injectable({
  providedIn: 'root'
})
export class RecordsService {

  constructor(private http: HttpClient) { }

  getRecords(activePage: Number): Observable<PaginationModel> {
    return this.http.get<PaginationModel>(`https://server-big-game-survey.herokuapp.com/records?linesPerPage=10&page=${activePage}`);
  }

}
