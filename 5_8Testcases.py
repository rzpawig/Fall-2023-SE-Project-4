/* def test_summary_with_random_input():
    user_input = entry.get()
    if not user_input.isalpha():
        print("Input contains non-alphabetic characters. Test not applicable.")
        return

    generate_summary()
    # Check the result and print for testing
    result = result_label['text'].strip()
    # Define your condition for a valid summary here
    if result:
        print("Test Summary with Random Input: Passed")
    else:
        print("Test Summary with Random Input: Failed")

def test_flashcards_with_random_input():
    user_input = entry.get()
    if not user_input.isalpha():
        print("Input contains non-alphabetic characters. Test not applicable.")
        return

    generate_flashcards()
    # Check the result and print for testing
    result = result_label['text'].strip()
    # Define your condition for a valid flashcard output here
    if result:
        print("Test Flashcards with Random Input: Passed")
    else:
        print("Test Flashcards with Random Input: Failed")
5-6^
def test_flashcards_with_special_chars():
    user_input = entry.get()
    if user_input.isascii():
        print("Input does not contain special/unrecognized characters. Test not applicable.")
        return

    generate_flashcards()
    # Check the result and print for testing
    result = result_label['text'].strip()
    # Define your condition for handling special characters
    if result:
        print("Test Flashcards with Special Characters: Passed")
    else:
        print("Test Flashcards with Special Characters: Failed")

def test_summary_with_special_chars():
    user_input = entry.get()
    if user_input.isascii():
        print("Input does not contain special/unrecognized characters. Test not applicable.")
        return

    generate_summary()
    # Check the result and print for testing
    result = result_label['text'].strip()
    # Define your condition for handling special characters
    if result:
        print("Test Summary with Special Characters: Passed")
    else:
        print("Test Summary with Special Characters: Failed")
7-8^ */
