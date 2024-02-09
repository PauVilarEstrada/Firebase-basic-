# Firebase basic proyect
# Async Drive
This Android Studio project leverages Firebase to streamline user management through authentication. It seamlessly integrates Firestore Database for efficient data storage and retrieval. Additionally, it harnesses Firebase Cloud Messaging (FCM) for real-time communication, making it an ideal solution for user-centric applications. 2024

# English:

## Description:
Async Drive is a Firebase-based application that allows the registration of up to 2 users, login functionality, and text document modification. It utilizes Firebase Authentication for user identity management, Firestore Database for data storage, and Firebase Cloud Messaging (FCM) for real-time communication between users.

### Implementation of Firebase Features:
## Authentication:
Registration and login with email and password for user security and access control.
Token-based FCM authentication for real-time updates.

## Firestore Database:
Storage of text documents, each with fields like body, title, editingUserId, and updatedAt.
Collections: "documents," "token," and "users" for organized data storage.

## Cloud Messaging (FCM):
Implementation of FCM for push notifications. (BETA no real utility)
Usage of API level 31 for effective push messaging.

## Java Files:

## Main:
onCreate: Initializes the main activity.
onStart: Delays execution and switches to LoginActivity.

## Login:
loginUser: Attempts login and saves FCM token to Firestore Database.
getTokenAndSaveToDatabase: Retrieves and stores the FCM token.

## RegisterActivity:
registerUser: Attempts user registration, checks registration availability.
performUserRegistration: Registers the user using Firebase Authentication.

## Document:
Represents a document with a title, body, and a unique identifier.

## FragmentEditText:
onCreateView: Creates and returns the fragment view.
loadDocumentInfo: Loads document info from Firestore.
updateDocument: Updates the document in Firestore.

## EditActivity:
onCreate: Configures the activity and replaces the fragment container.

## Libraries:
### Appcompat, Material, Firebase Auth, Firebase Database, Firebase Analytics, Firebase BOM, Firebase Firestore, Firebase Messaging, Firebase Config, Play Services Auth, Play Services Location, Firebase Core.

## Conclusions:
Async Drive, powered by Firebase, provided insights into app creation with Firebase services, simplifying processes like login, registration, cloud database connectivity, and server-device messaging.

This is a basic Firebase project for educational purposes, utilizing the free Firebase plan for a 30-day trial. Users are encouraged to create their Firebase project for extended usage.

# Español:
# Proyecto basico de Firebase
# Async Drive
Este proyecto de Android Studio aprovecha Firebase para simplificar la gestión de usuarios a través de la autenticación. Integra de manera transparente Firestore Database para un almacenamiento y recuperación eficientes de datos. Además, utiliza Firebase Cloud Messaging (FCM) para la comunicación en tiempo real, convirtiéndolo en una solución ideal para aplicaciones centradas en el usuario. 2024
## Descripción:
Async Drive es una aplicación basada en los servicios de Firebase que permite el registro de hasta 2 usuarios, inicio de sesión y modificación de documentos de texto. Utiliza Firebase Authentication para la gestión de identidad, Firestore Database para almacenamiento de datos y Firebase Cloud Messaging (FCM) para comunicación en tiempo real entre usuarios.

### Implementación de Funcionalidades de Firebase:

## Autenticación:
Registro e inicio de sesión con correo y contraseña para seguridad y control de acceso.
Autenticación basada en tokens FCM para actualizaciones en tiempo real.

## Firestore Database:
Almacenamiento de documentos de texto con campos como cuerpo, título, editingUserId y updatedAt.
Colecciones: "documents", "token" y "users" para almacenamiento organizado de datos.

## Cloud Messaging (FCM):
Implementación de FCM para notificaciones push. (BETA, no tiene una utilidad real, solo de prueba)
Uso del nivel de API 31 para mensajería efectiva.

## Archivos Java:

## Main:
onCreate: Inicializa la actividad principal.
onStart: Retrasa la ejecución y cambia a LoginActivity.

## Login:
loginUser: Intenta iniciar sesión y guarda el token FCM en Firestore Database.
getTokenAndSaveToDatabase: Obtiene y almacena el token FCM.

## RegisterActivity:
registerUser: Intenta registrar al usuario, verifica disponibilidad de registros.
performUserRegistration: Registra al usuario usando Firebase Authentication.

## Document:
Representa un documento con título, cuerpo y un identificador único.

## FragmentEditText:
onCreateView: Crea y devuelve la vista del fragmento.
loadDocumentInfo: Carga la información del documento desde Firestore.
updateDocument: Actualiza el documento en Firestore.

## EditActivity:
onCreate: Configura la actividad y reemplaza el contenedor de fragmentos.

## Bibliotecas:
### Appcompat, Material, Firebase Auth, Firebase Database, Firebase Analytics, Firebase BOM, Firebase Firestore, Firebase Messaging, Firebase Config, Play Services Auth, Play Services Location, Firebase Core.

## Conclusiones:
Async Drive, potenciado por Firebase, proporcionó perspectivas sobre la creación de aplicaciones con servicios Firebase, simplificando procesos como inicio de sesión, registro, conectividad a bases de datos en la nube y mensajería servidor-dispositivo.

Este es un proyecto básico de Firebase con fines educativos, utilizando el plan gratuito de Firebase por un periodo de 30 días. Se recomienda a los usuarios crear su propio proyecto Firebase para un uso prolongado.
