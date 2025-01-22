# 💱 Conversor de Monedas

Este es un proyecto de conversión de monedas desarrollado en **Java** utilizando la API de tasas de cambio. Permite convertir entre distintas monedas basadas en tasas de cambio en tiempo real.

## 🚀 Características

- Conversión entre múltiples monedas (USD, EUR, GBP, etc.).
- Integración con una API de tasas de cambio en tiempo real.
- Interfaz de usuario sencilla y amigable (CLI o GUI, según el caso).
- Manejo de errores y validaciones.
- Soporte para redondeo de valores y formato de salida.

## 🛠️ Tecnologías utilizadas

- **Java 17** 
- **Maven** (para la gestión de dependencias)
- **Spring Boot** (opcional si se usó)
- **JSON** (para el manejo de respuestas de la API)
- **REST API** (para obtener tasas de cambio)

## 📦 Instalación

1. Clona este repositorio:
```bash
git clone https://github.com/Emanuel2106/ConversorMonedas.git
```

2. Entra al directorio del proyecto:
```bash
git clone https://github.com/Emanuel2106/ConversorMonedas.git
```

3. Construye el proyecto con Maven:
```bash
mvn clean install
```

4. Ejecuta el proyecto:
```bash
mvn spring-boot:run
```

## ⚙️ Uso

1. Al iniciar, se te pedirá ingresar:

- La moneda de origen (por ejemplo, USD).
- La moneda de destino (por ejemplo, EUR).
- El monto a convertir.
2. El sistema devolverá el monto convertido según la tasa de cambio actual.

