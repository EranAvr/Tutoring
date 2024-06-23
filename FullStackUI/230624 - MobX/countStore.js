import { makeAutoObservable } from "mobx";

const store = {
    count: 0,
    get readValue(){
        return "*" + this.count + "*";
    },
    set setValue(val){
        this.count = val;
    }
}

makeAutoObservable(store);

export default store;