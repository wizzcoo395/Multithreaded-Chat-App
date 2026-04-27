# Multithreaded-Chat-App


*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: KAUSHIK PAUL

*INTERN ID*: CTIS8066

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 6 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR


# Multithreaded Chat Application (Java)

This project is a simple client-server chat application built using Java sockets and multithreading. The goal of this program is to allow multiple users to connect to a central server and communicate with each other in real time through the command line.

The application consists of three main components: ChatServer, ClientHandler, and ChatClient. The server is responsible for accepting incoming client connections and managing communication between them. Each time a new client connects, the server creates a new thread using the ClientHandler class. This ensures that multiple clients can interact with the server at the same time without blocking each other.

The ClientHandler class plays an important role in handling communication for each connected client. It continuously listens for messages from its respective client and forwards those messages to the server. The server then broadcasts the message to all other connected clients. This mechanism enables real-time communication among users.

On the client side, the ChatClient program connects to the server using a socket. It uses two threads: one for sending messages and another for receiving messages. This allows the client to send and receive messages simultaneously without interruption. When the client starts, it prompts the user to enter a name, which is then attached to every message sent. This makes the chat more readable and user-friendly.

To run the application, first compile all Java files using the command:

javac *.java

After successful compilation, start the server using:

java ChatServer

Then open multiple terminals and run the client program in each:

java ChatClient

Each client will be prompted to enter a name. Once connected, users can start sending messages. Messages sent by one client will instantly appear on all other clients, demonstrating real-time communication.

This project demonstrates key concepts such as socket programming, multithreading, and concurrent communication in Java. It is a basic but effective implementation of how chat systems work. Additional features like private messaging, GUI interface, or message timestamps can be added to enhance functionality further.

Overall, this application provides a clear understanding of how multiple clients can communicate simultaneously through a server using threads.
