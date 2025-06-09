import { makeAutoObservable } from "mobx";

export class CountStore {
    count = 0

    constructor() {
        makeAutoObservable(this);
    }

    decrement = () => {
        this.count -= 1;
    };
    increment = () => {
        this.count += 1;
    };

    get readCount(){
        return this.count;
    }
}