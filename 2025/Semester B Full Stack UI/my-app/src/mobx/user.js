import { makeAutoObservable } from "mobx";

const userStore = {
    userName: "",
    userId: "",
    imgURL: "",
    get readUserName(){
        return this.userName;
    },
    get readUserId(){
        return this.userId;
    },
    get presentUserId(){
        return "#" + this.userId;
    },
    get readUserImage(){
        return this.imgURL;
    },
    set changeUserName(name){
        this.userName = name;
    },
    set changeImageURL(imgURL){
        this.imgURL = imgURL;
    },
}

makeAutoObservable(userStore);

export default userStore;