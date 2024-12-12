
/*
    This file contains:
    1) initState - just a format-object, to give the state
    an initial structure.
    2) reducer - an update function for state variable.
*/
export const initState = {
    userName: "Bobby",
    email: "bob@mail.com"
};

export function reducer(state, action){
    switch(action.type){
        case "username":
            return {
                ...state,
                userName: action.userName
            };
        case "email":
            return {
                ...state,
                email: action.email
            };
    }
}

