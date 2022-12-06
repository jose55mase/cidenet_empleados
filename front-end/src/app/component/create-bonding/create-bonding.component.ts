import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormControl } from '@angular/forms';
import { Candidate } from 'src/app/model/candidate';
import { CandidateServiceService } from 'src/app/service/candidate-service.service';

@Component({
  selector: 'app-create-bonding',
  templateUrl: './create-bonding.component.html',
  styleUrls: ['./create-bonding.component.sass']
})
export class CreateBondingComponent implements OnInit {

  checkoutForm;
  procesState = {
    status : ""
  }
  candidate : Candidate = {
    contry : "",
    firstName: "",
    firstSurName : "",
    secondSurName:"",
    secondName:"",
    identityType:"",
    identityNumber:"",
    email: ""
  };
  
  constructor(private formBuilder: FormBuilder,private candidateDataService : CandidateServiceService) {
    this.checkoutForm = this.formBuilder.group({
      firstName: new FormControl('',Validators.compose([
        Validators.required,
        Validators.maxLength(20),
        Validators.pattern('[A-Z ]*')
      ])),     
      secondName: new FormControl('',Validators.compose([
        Validators.required,
        Validators.maxLength(20),
        Validators.pattern('[A-Z ]*')
      ])),  

      firstSurName: new FormControl('',Validators.compose([
        Validators.required,
        Validators.maxLength(20),
        Validators.pattern('[A-Z ]*')
      ])),

      secondSurName: new FormControl('',Validators.compose([
        Validators.required,
        Validators.maxLength(20),
        Validators.pattern('[A-Z ]*')
      ])), 
      
      identityNumber: new FormControl('',Validators.compose([
        Validators.required,
        Validators.maxLength(20),
        Validators.pattern('[a-zA-Z0-9 ]*')
      ])), 

      email: new FormControl('',Validators.compose([])),
      contry: new FormControl('',Validators.compose([])), 
    });
  }

  ngOnInit(): void {
  }

  onSubmit() {
    // TODO: Use EventEmitter with form value
    let candidate : Candidate;
    this.candidate = candidate = {
      contry : this.checkoutForm.get('contry')?.value,
      firstName: this.checkoutForm.get('firstName')?.value,
      firstSurName : this.checkoutForm.get('firstSurName')?.value,
      secondSurName:"",
      secondName:this.checkoutForm.get('firstName')?.value,
      identityType:"",
      identityNumber:"",
      email: this.checkoutForm.get('firstName')?.value+"."
        +this.checkoutForm.get('firstSurName')?.value+new Date(Date.now()).getMilliseconds()
        +"@"
        +"develop.com"
    }
    console.log(this.candidate)
    setTimeout(()=>{this.procesState.status = "LOADING"}, 3000);
    setTimeout(()=>{this.procesState.status = "ERROR"}, 3000);
    setTimeout(()=>{
      this.procesState.status = "SUCCESS"
      setTimeout(()=>{this.procesState.status = ""}, 3000);
    }, 3000);
    this.candidateDataService.setData(this.candidate);
    this.checkoutForm.reset();
   // setTimeout(()=>{this.procesState.status = ""}, 3000);
    //this.procesState.status = "LOADING"
    //this.procesState.status = "ERROR"
    //this.procesState.status = "SUCCESS"
  }
  

}
