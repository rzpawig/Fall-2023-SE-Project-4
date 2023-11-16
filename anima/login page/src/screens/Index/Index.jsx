import React from "react";
import "./style.css";

export const Index = () => {
  return (
    <div className="index">
      <div className="div">
        <div className="overlap">
          <img
            className="rectangle"
            alt="Rectangle"
            src="https://cdn.animaapp.com/projects/655291c9101ba6f66f8e4e7a/releases/65554139609256ee35d8be27/img/rectangle-13.svg"
          />
          <div className="signup-title">
            <div className="overlap-group">
              <img
                className="rectangle"
                alt="Rectangle"
                src="https://cdn.animaapp.com/projects/655291c9101ba6f66f8e4e7a/releases/6555498d293ada290f0ffd18/img/rectangle-19.svg"
              />
              <p className="text-wrapper">Sign up or log in to use Study Craft!</p>
            </div>
          </div>
        </div>
        <div className="overlap-2">
          <div className="footer" />
          <img
            className="logo"
            alt="Logo"
            src="https://cdn.animaapp.com/projects/655291c9101ba6f66f8e4e7a/releases/65554139609256ee35d8be27/img/image-2.png"
          />
        </div>
        <div className="authentication-group">
          <div className="overlap-3">
            <div className="overlap-4">
              <img
                className="img"
                alt="Rectangle"
                src="https://cdn.animaapp.com/projects/655291c9101ba6f66f8e4e7a/releases/65554139609256ee35d8be27/img/rectangle-24.png"
              />
              <div className="username-group">
                <input className="username" />
              </div>
            </div>
            <div className="password-group">
              <div className="password-wrapper">
                <input className="password" />
              </div>
            </div>
            <button className="submit-button">
              <div className="div-wrapper">
                <div className="text-wrapper-2">Submit</div>
              </div>
            </button>
          </div>
        </div>
        <div className="header" />
      </div>
    </div>
  );
};
