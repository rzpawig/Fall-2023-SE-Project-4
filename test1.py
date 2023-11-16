from flask import Flask, request, jsonify
from flask_cors import CORS

app = Flask(__name__)
CORS(app)  # Enable CORS for cross-origin requests from your React app

USER_CREDENTIALS = {
    "username": "user123",
    "password": "password123"
}

@app.route('/login', methods=['POST'])
def handle_login():
    data = request.json
    if data['username'] == USER_CREDENTIALS["username"] and data['password'] == USER_CREDENTIALS["password"]:
        return jsonify({"message": "Login successful!"}), 200
    else:
        return jsonify({"message": "Invalid username or password."}), 401

if __name__ == '__main__':
    app.run(debug=True)
