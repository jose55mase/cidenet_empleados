import { EventEmitter, Injectable } from '@angular/core';
import { Candidate } from '../model/candidate';

// 12300659

@Injectable({
  providedIn: 'root'
})
export class CandidateServiceService {

  data : EventEmitter<Candidate> = new EventEmitter()

  setData(item:any){
    this.data.emit(item);
  }
  getData(){
    return this.data;
  }

  constructor() { }
}
