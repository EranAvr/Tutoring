import { makeAutoObservable } from "mobx";

class LanguageStore {
    lang = "english";   // state data
    choices = ["english", "hebrew", "arabic", "dutch", "german"]

    constructor(){
        makeAutoObservable(this);   // turn into MobX store
    }

    get readLang(){     // computed value (get)
        return this.lang;
    }

    set setLang(newLang){   // mutating action (set)
        this.lang = newLang;
    }

}

const language = new LanguageStore();
export default language;