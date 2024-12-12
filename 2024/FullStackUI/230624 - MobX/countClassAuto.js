import { makeAutoObservable, reaction } from "mobx";

class Store{

    constructor(){
        this.count = 0;
        makeAutoObservable(this);
        // The makeAutoObservable(this) function call makes this class
        // an observable state.
        // The function maps the class automatically, in
        // terms of mobx (observables, actions etc..)
    }

    increment = () => {
        this.count++;
    }
    decrement = () => {
        this.count--;
    }
    setValue = (val) => {
        this.count = val;
    }

}

const store = new Store();

// reactions can be added outside of the class-
reaction(() => store.count, (value, previousValue, reaction) => {
    console.log("Auto Store Class, reaction; value = " + value);
})

export default store;