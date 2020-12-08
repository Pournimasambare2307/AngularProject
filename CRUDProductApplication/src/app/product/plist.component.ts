import { Component } from '@angular/core';
import {Product} from '../product.model'
import { ProductService } from '../product.service';
@Component({
    selector:"plist",
    templateUrl:"./plist.component.html",
    styleUrls:["./plist.component.css"]
})
export class PlistComponent {
    parr:Product[];
  constructor(private pservice:ProductService){
      console.log("plist constructor called");
  }
  ngOnInit(){
      console.log("ngInit plist called");
      this.parr==this.pservice.getAllProduct();
  }
}