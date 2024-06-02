// import built-in function-
import {createContext} from 'react'

// We are using 'createContext()' to create Context objects.
// The function takes a single parameter which defines the default value.
export const ThemeContext = createContext('hcvugjhbn');     // here, the default value is nonsense..

export const DifferentContext = createContext('different text');    // here, the default value is a string.