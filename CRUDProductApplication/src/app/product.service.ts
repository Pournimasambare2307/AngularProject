import { Injectable } from '@angular/core';
import {Product} from './product.model';
@Injectable()
export class ProductService{
    parr=[new Product(11,"lays",30.00),
    new Product(12,"nachos",20.00),
    new Product(13,"kinderjoy",40.00),
    new Product(14,"butter",80.00)]

    getAllProduct():Product[]{
        return this.parr;
    }
    addProduct(p:Product){
        this.parr.push(p);

    }
    updateProduct(p){
        for(var i=0;i<this.parr.length;i++){
            if(this.parr[i].pid==p.pid){
                this.parr[i].pname=p.pname;
                this.parr[i].price=p.price;
                break;
            }
        }
    }
    deleteProduct(p:Product){
        for(var i=0;i<this.parr.length;i++){
            if(this.parr[i].pid==p.pid){
                //splice will delete one object from array at ith position
                this.parr.splice(i,1);
              
                break;
            }
        }
    }
}