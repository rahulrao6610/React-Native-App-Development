📲 RNNotificationApp
A React Native-based Android application demonstrating the implementation of Firebase Cloud Messaging (FCM) push notifications using both Java/Kotlin native modules and JavaScript integration.

✅ This project was developed as part of a mobile app development internship assignment.

🚀 Features
🔔 Receive push notifications via Firebase Cloud Messaging (FCM)

⚙️ Integrated native Android module using Java for background handling

🔄 Real-time notification rendering in the React Native UI

📱 Built and tested using Android Emulator in Android Studio

📦 Properly configured Gradle, SDK, and native dependencies

📁 Project Structure
bash
Copy
Edit
RNNotificationApp/
├── android/           # Native Android code (Java module integrated)
├── ios/               # iOS folder (optional for Android-only apps)
├── node_modules/
├── App.js             # Main RN logic (notification logic here)
├── package.json
🧩 Tech Stack
React Native v0.71.8

Firebase Cloud Messaging (FCM)

Android Studio Emulator (AVD)

Java native module integration for push notification listener

Gradle v7.4.2

🛠️ Setup Instructions
bash
Copy
Edit
git clone https://github.com/your-username/RNNotificationApp.git
cd RNNotificationApp

# Install dependencies
npm install --legacy-peer-deps

# Android setup
cd android
./gradlew clean
cd ..

# Start Metro server
npx react-native start --reset-cache

# Run app on emulator
npx react-native run-android
📷 Screenshots
<img width="826" height="893" alt="Screenshot 2025-07-20 010321" src="https://github.com/user-attachments/assets/cbfcdb26-de1f-4998-8b3d-a31f4be56de6" />
