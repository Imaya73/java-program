import React from "react";

const Home = () => {
  return (
    <div style={styles.page}>
      <h1>Welcome to the Home Page</h1>
      <p>This is the homepage of our SPA!</p>
    </div>
  );
};

const styles = {
  page: {
    padding: "20px",
    textAlign: "center",
  },
};

export default Home;