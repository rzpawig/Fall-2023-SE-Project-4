import React, { useState } from 'react';
import './App.css';

function FlashcardPage() {
  const [flashcards, setFlashcards] = useState([]);
  const [front, setFront] = useState('');
  const [back, setBack] = useState('');
  const [editingIndex, setEditingIndex] = useState(null);

  const handleFrontChange = (event) => {
    setFront(event.target.value);
  };

  const handleBackChange = (event) => {
    setBack(event.target.value);
  };

  const handleCreateFlashcard = () => {
    const newFlashcard = { front, back, flipped: false };
    setFlashcards([...flashcards, newFlashcard]);
    setFront('');
    setBack('');
  };

  const handleEditFlashcard = (index) => {
    setFront(flashcards[index].front);
    setBack(flashcards[index].back);
    setEditingIndex(index);
  };

  const handleUpdateFlashcard = () => {
    const updatedFlashcards = [...flashcards];
    updatedFlashcards[editingIndex] = { front, back, flipped: false };
    setFlashcards(updatedFlashcards);
    setFront('');
    setBack('');
    setEditingIndex(null);
  };

  const handleDeleteFlashcard = (index) => {
    const updatedFlashcards = [...flashcards];
    updatedFlashcards.splice(index, 1);
    setFlashcards(updatedFlashcards);
  };

  const handleFlipCard = (index) => {
    const updatedFlashcards = [...flashcards];
    updatedFlashcards[index].flipped = !updatedFlashcards[index].flipped;
    setFlashcards(updatedFlashcards);
  };

  return (
    <div>
      <input value={front} onChange={handleFrontChange} placeholder="Front" />
      <input value={back} onChange={handleBackChange} placeholder="Back" />
      {editingIndex === null ? (
        <button onClick={handleCreateFlashcard}>Create</button>
      ) : (
        <button onClick={handleUpdateFlashcard}>Update</button>
      )}
      <ul className="flashcard-list">
        {flashcards.map((flashcard, index) => (
          <li key={index} className={`flashcard ${flashcard.flipped ? 'flipped' : ''}`}>
            <div className="flashcard-front" onClick={() => handleFlipCard(index)}>
              {flashcard.flipped ? flashcard.back : flashcard.front}
            </div>
            <div className="flashcard-back" onClick={() => handleFlipCard(index)}>
              {flashcard.flipped ? flashcard.front : flashcard.back}
            </div>
            <button onClick={() => handleEditFlashcard(index)}>Edit</button>
            <button onClick={() => handleDeleteFlashcard(index)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FlashcardPage;