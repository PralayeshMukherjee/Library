import React, { createContext, useState } from "react";

const ThemeContext = createContext();

const ThemeProvider = ({ children }) => {
  const [darkMode, setDarkMode] = useState(false);

  return (
    <ThemeContext.Provider value={{ darkMode, setDarkMode }}>
      <div className={darkMode ? "dark" : "light"}>{children}</div>
    </ThemeContext.Provider>
  );
};

export { ThemeProvider, ThemeContext };
