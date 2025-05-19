export const reducer = (state, action) => {
    switch (action.type) {
      case "USERNAME":
        return {...state, userName: action.value ? action.value : "empty field"}
      case "EMAIL":
        return {...state, email: action.value ? action.value : "empty field"}
      default:
        return state;
    }
  }