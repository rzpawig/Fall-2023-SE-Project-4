import React from "react";
import "./style.css";

export const Index = () => {
  return (
    <div className="index">
      <div className="div">
        <div className="overlap">
          <div className="footer" />
          <img
            className="logo"
            alt="Logo"
            src="https://cdn.animaapp.com/projects/655291c9101ba6f66f8e4e7a/releases/65554139609256ee35d8be27/img/image-2.png"
          />
        </div>
        <div className="overlap-group">
          <img
            className="rectangle"
            alt="Rectangle"
            src="https://cdn.animaapp.com/projects/655291c9101ba6f66f8e4e7a/releases/65554139609256ee35d8be27/img/rectangle-24.png"
          />
          <div className="text-wrapper">Current User</div>
        </div>
        <div className="homepage-title">
          <div className="overlap-group-2">
            <img
              className="img"
              alt="Rectangle"
              src="https://cdn.animaapp.com/projects/655291c9101ba6f66f8e4e7a/releases/6555498d293ada290f0ffd18/img/rectangle-19.svg"
            />
            <div className="text-wrapper-2">WELCOME TO YOUR HOMEPAGE</div>
          </div>
        </div>
        <div className="chatbot-group">
          <div className="overlap-2">
            <div className="div-wrapper">
              <div className="text-wrapper-3">Chatbot</div>
            </div>
            <p className="p">Generate flashcards, questions, or notes with AI</p>
          </div>
        </div>
        <div className="flashcarddeck-group">
          <div className="overlap-2">
            <div className="overlap-group-3">
              <div className="text-wrapper-4">Flashcard Decks</div>
            </div>
            <div className="text-wrapper-5">View or create flashcards</div>
          </div>
        </div>
        <div className="questionset-group">
          <div className="overlap-2">
            <div className="overlap-group-4">
              <div className="text-wrapper-6">Question Sets</div>
            </div>
            <div className="text-wrapper-7">View or create questions</div>
          </div>
        </div>
      </div>
    </div>
  );
};
