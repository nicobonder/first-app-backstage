import React from 'react'

const MyComponent = () => {
  const handleClick = () => {
    alert('Hello, Backstage!');
  };

  return (
    <div>
      <h2>My component Example</h2>
      <button onClick={handleClick}>Hello, Backstage!</button>
    </div>
  );
};

export default MyComponent;