import { Component } from '@angular/core';
import { Candidate } from './model/candidate';
import { CandidateServiceService } from './service/candidate-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  candidate : Candidate[] = [];

  constructor(private candidateDataService : CandidateServiceService) { }

  ngOnInit(): void {
    this.candidateDataService.getData().subscribe(
      response => {
        console.log("LOADING ", response)
        this.candidate.push(response);
      }
    )

    this.loadDataService();
  }


  loadDataService(){
    this.candidate;
  }
}
