import { RecordModel } from './records-model';

export type PaginationModel ={
  content: RecordModel[];
  totalPages: number;
}
