import { autorun, makeAutoObservable }  from "mobx";

const themeStore = {
    theme: "light",
    get readTheme(){
        return this.theme;
    },
    get readNext(){
        return "Change to " + (this.theme==='light' ? 'dark' : 'light');
    },
    set changeTheme(val){
        //this.theme = val
        this.theme = this.theme==='light' ? 'dark' : 'light';
    }
}

makeAutoObservable(themeStore);

autorun(
    () => {alert("Current theme: " + themeStore.theme)}
);

export default themeStore;