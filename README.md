# Vedic SBC Android APK

GitHub-only Android project. No Android Studio is required to build the debug APK: the included GitHub Actions workflow uses a GitHub-hosted runner, JDK 17 and Gradle 8.7, then uploads `app-debug.apk` as an Actions artifact.

## Features in this starter build
- Person list stored locally on the phone
- Birth date/time/place + latitude/longitude
- Live Swiss Ephemeris API request using sidereal Lahiri
- Sun, Moon, Mars, Mercury, Jupiter, Venus, Saturn, Rahu and Ketu
- Nakshatra and Pada calculation from sidereal longitude
- 9×9 Sarvatobhadra-style board with 28-nakshatra outer ring, rashi, tithi and consonant layers
- Transit calculation for any date/time
- Planet-to-planet search for same nakshatra/pada/rashi
- GitHub Actions APK build

## Build
1. Create a GitHub repository.
2. Upload this entire project.
3. Go to **Actions**.
4. Select **Build Vedic SBC APK**.
5. Run workflow.
6. Open the completed run and download **Vedic-SBC-debug-apk**.

GitHub Actions is a CI/CD system and GitHub-hosted runners can build Android projects. The workflow uses the Gradle build system and uploads the APK as an artifact.

## Calculation source
The app calls the public Swiss Ephemeris API used in the project: `https://swiss-ephemeris-api-2m5g.onrender.com/v1/chart`. The API documentation states that it supports sidereal Lahiri, planetary speeds/retrograde status, and chart positions. The app performs the Nakshatra/Pada and Sarvatobhadra presentation layer itself.

## Important Sarvatobhadra note
Classical sources describe more than one Vedha-motion convention. This build explicitly labels the Sun/Moon/nodes as using all three directions and direct/retrograde rules for the other planets. Before using the app for serious research, compare its 9×9 placement and Vedha rays against the exact SBC edition/reference you follow and lock that convention into the calculation module.

## License note
Swiss Ephemeris has AGPL licensing considerations and also a professional-license route. If you distribute a product using Swiss Ephemeris, review the applicable license terms.
