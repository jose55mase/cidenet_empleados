import { Component, OnInit } from '@angular/core';
import { Candidate } from 'src/app/model/candidate';
import { CandidateServiceService } from 'src/app/service/candidate-service.service';

@Component({
  selector: 'app-bonding',
  templateUrl: './bonding.component.html',
  styleUrls: ['./bonding.component.sass']
})
export class BondingComponent implements OnInit {

  candidate : Candidate[] = [];

  constructor() { }

  ngOnInit(): void {
   
  }

}
