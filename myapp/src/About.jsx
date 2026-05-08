import React from "react";

const About = () => {
  return (
    <div style={styles.page}>
      <h1>About Us</h1>
      <p>Learn more about our Single Page Application and its purpose.</p>
    </div>
  );
};

const styles = {
  page: {
    padding: "20px",
    textAlign: "center",
  },
};

export default About;