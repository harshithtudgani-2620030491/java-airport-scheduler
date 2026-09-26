# KLHB-FED-26-15-6Airport Flight Board & Scheduler 

Java Airport Scheduler Project
# Team Members
1.Harshith Tudgani - Roll No:2620030491
2.Mothkuri Eshanth - Roll No:2620030131
#Supervisor
Sreerama Murthy Kattamuri
#Abstract
The Airport Flight Board & Scheduler is a console-based Java application that models the core scheduling and information-display functions of an airport operations desk. The system allows staff to add, update, cancel, and remove flights, while automatically detecting gate and time scheduling conflicts before a change is accepted. Flight statuses (Scheduled, Boarding, Delayed, Departed, Cancelled) are transitioned automatically based on the current time relative to each flight's departure and arrival, and a live auto-refreshing board can display these updates in real time on a background thread. Flights can be searched and filtered by flight number, destination, airline, or status, and all flight data is serialized to disk so it persists between runs. The project applies object-oriented design principles and two classic design patterns — Singleton (for the central Scheduler engine) and Observer (for the FlightBoard display) — to produce a maintainable, extensible simulation of an airport flight management system.
