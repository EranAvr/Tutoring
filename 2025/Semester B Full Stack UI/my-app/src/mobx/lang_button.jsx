import { observer } from 'mobx-react';
import langStore from './language'


function LanguageButton(){

    return(
        <div>
            <h2>App Language:</h2>
            Current: <span>{langStore.readLang}</span> <br />

            <select onChange={({target})=>{langStore.setLang = target.value}}>
                {
                    langStore.choices.map(lng => <option key={lng} value={lng}>{lng}</option>)
                }
            </select>
        </div>
    );
}

export default observer(LanguageButton);