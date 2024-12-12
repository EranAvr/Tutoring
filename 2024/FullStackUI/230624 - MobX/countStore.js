import { autorun, makeAutoObservable, set } from "mobx";

const store = {
    count: 0,
    get readValue(){
        return this.count;
    },
    get readFormattedValue(){
        return "*" + this.count + "*";
    },
    set setValue(val){
        this.count = val;
    },
    set increment(val) {
        this.count += val;
    },
    set decrement(val) {
        this.count -= val;
    }
}
makeAutoObservable(store);

autorun(() => {
    console.log("Store object, autorun; value = " + store.count);
})

export default store;