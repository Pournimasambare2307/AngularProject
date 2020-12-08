import { Component } from '@angular/core';
import { Product } from "../product.model"
import { ProductService } from '../product.service';
@Component({
    selector:"ptab",
    templateUrl:"./ptab.component.html",
    styleUrls:["./ptab.component.css"]
})
export class PtabComponent{
   parr:Product[];
    pob:Product;
    flag=false;
    constructor(private pservice:ProductService){
        console.log("constructor in ptab called");
    }
    ngOnInit(){
        console.log("ngOnInit called in ptab");
        this.parr=this.pservice.getAllProduct();
    }
    updateProduct(p:Product){
        this.flag=true;
        //this will assign product to child property
        this.pob=p;
    }
    deleteProduct(p){
       this.pservice.deleteProduct(p); 
    }
    displayform(){
        this.flag=true;
    }
}