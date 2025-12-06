# 🔬 Multi-Unit Scientific Converter

A **Java console application** to convert **Length, Time, Weight, and Temperature** units.  
This project demonstrates **object-oriented programming (OOP)** principles such as **inheritance** and **encapsulation**.

---

## 🚀 Features

✅ Convert between multiple units:

| Converter Type   | Units                               |
|-----------------|------------------------------------|
| **Length**       | Meter, Kilometer, Mile, Foot       |
| **Time**         | Second, Minute, Hour               |
| **Weight**       | Gram, Kilogram, Pound              |
| **Temperature**  | Celsius, Fahrenheit, Kelvin        |

✅ Console-based user interface  
✅ Input validation for units and values  
✅ Repeat conversion without restarting the program  

---

## 🏗️ Project Structure

Converter (Base class)
│
├── LengthConverter
├── TimeConverter
├── WeightConverter
├── TemperatureConverter
└── Main (Driver class)


- `Converter` → Base class containing common attributes (`unit`, `value`) and methods (`conversion()`, `display()`)  
- `LengthConverter` → Converts between meters, kilometers, feet, and miles  
- `TimeConverter` → Converts between seconds, minutes, and hours  
- `WeightConverter` → Converts between grams, kilograms, and pounds  
- `TemperatureConverter` → Converts between Celsius, Fahrenheit, and Kelvin  
- `Main` → Handles user interface and program flow  

---

## 🖥️ Example Output

\u001B[36m===== MULTI-UNIT SCIENTIFIC CONVERTER =====\u001B[0m

1. Length Converter
2. Time Converter
3. Weight Converter
4. Temperature Converter

Select an option: 1

\u001B[34m----- Length Converter -----\u001B[0m
Units:
1. Meter
2. Kilometer
3. Mile
4. Foot

Enter the index of your unit: 2
Enter the value: 5

Converting 5.0 km

\u001B[34mResult:
----------------------------\u001B[0m
Meter:     5000.000 m
Kilometer: 5.000 km
Feet:      16404.199 ft
Mile:      3.107 mile
\u001B[34m----------------------------\u001B[0m

\u001B[33mDo you want another conversion? (y/n): \u001B[0m y

Select an option: 4

\u001B[34m----- Temperature Converter -----\u001B[0m
Units:
1. Celsius
2. Fahrenheit
3. Kelvin

Enter the index of your unit: 1
Enter the value: 25

Converting 25.0 \u00B0C

\u001B[34mResult:
----------------------------\u001B[0m
Celsius:    25.000 \u00B0C
Fahrenheit: 77.000 \u00B0F
Kelvin:     298.000 K
\u001B[34m----------------------------\u001B[0m

\u001B[33mDo you want another conversion? (y/n): \u001B[0m n

\u001B[32mThank you for using the converter. Goodbye!\u001B[0m


---

## 👤 Author
Salem Nur Abir
CSE Student at AIUB

---
