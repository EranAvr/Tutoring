import themeStore from './theme';

export const ThemeButton = () => {
    
    return(
        <button onClick={()=>{themeStore.changeTheme="test"}}>
          {themeStore.readNext} 
        </button>
    );
}
