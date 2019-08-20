import { Component, OnInit, Input, Output } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
 cars:car []
  userservice: any;
  index : number
  constructor() { }
  @Input() Message:string;
  
  ngOnInit() {
    
    this.cars =[{
      id:1,
      name:'ferrari',
      speed:200,
      price:5450000,
  

    },
    {
      id:2,
      name:'audi',
      speed:300,
    price:50890000,
    

    },
    {
      id:3,
      name:'benz',
      speed:250,
      price:50000000,
    

    }]
  }

 clickMe(){
   this.cars.push({
    id:4,
    name:'hayaboosa',
    speed:250,
    price:50000000,
    

   })
 }


 deleteuser(id){
        this.cars.find((e,i) =>{
          this.index = i
            return e.id == id
        })
    
        this.cars.splice(this.index,1)
    }
   
  }

interface car {
  name:string
  speed:number
  price:number
  id:number
  
}
