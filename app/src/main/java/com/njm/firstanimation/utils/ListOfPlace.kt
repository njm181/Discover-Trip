package com.njm.firstanimation.utils

import com.njm.firstanimation.R
import com.njm.firstanimation.model.Author
import com.njm.firstanimation.model.Place

val listOfPlace: List<Place> = listOf(
        Place(
                "Villa La Angostura",
                "Villa La Angostura es una ciudad turística en el lago Nahuel Huapi de la Patagonia argentina. Es conocida por sus edificios de madera de estilo alpino. El Parque Nacional Nahuel Huapi circundante tiene montañas andinas, lagos y bosques. Cerca está el Parque Nacional Los Arrayanes que alberga esta especie de árbol hace siglos. Las pistas de esquí del cerro Bayo se encuentran justo afuera de la ciudad. El camino Siete Lagos serpentea al norte hacia la ciudad de San Martín de los Andes.",
                listOf(R.drawable.vl1, R.drawable.vl2, R.drawable.vl3, R.drawable.vl4),
                "Neuquen(ARG)", "79.6 km²", "11.235",
                Author("Morgan Jorgennsen", R.drawable.morgan, "Es un excelente lugar para vacacionar en verano o para disfrutar de un invierno con muchas actividades")
        ),
        Place(
                "Sidney Opera House",
                "Sídney, capital de Nueva Gales del Sur y una de las ciudades más grandes de Australia, es famosa por su Casa de la Ópera de Sídney junto al puerto, con un característico diseño con forma de velas. El enorme Puerto Darling y el puerto Circular Quay más pequeño son núcleos de la vida ribereña, con el arqueado puente de la bahía de Sídney y el reconocido Real Jardín Botánico que se encuentra cerca. La plataforma exterior de la Sydney Tower, el Skywalk, ofrece vistas en 360 grados de la ciudad y los suburbios",
                listOf(R.drawable.sid1, R.drawable.sid2, R.drawable.sid3, R.drawable.sid4),
                "Sidney(AUS)", "12.368 km²", "5.312M",
                Author("Monica Munich", R.drawable.monica, "Una experiencia unica que todos debemos pasar al menos una vez en la vida, el clima, los colores, todo.")
        ),
        Place(
                "Paris",
                "París, la capital de Francia, es una importante ciudad europea y un centro mundial del arte, la moda, la gastronomía y la cultura. Su paisaje urbano del siglo XIX está entrecruzado por amplios bulevares y el río Sena. Aparte de estos hitos, como la Torre Eiffel y la catedral gótica de Notre Dame del siglo XII, la ciudad es famosa por su cultura del café y las tiendas de moda de diseñador a lo largo de la calle Rue du Faubourg Saint",
                listOf(R.drawable.par1, R.drawable.par2, R.drawable.par3, R.drawable.par4),
                "Paris(FRA)", "105.4 km²", "2.161M",
                Author("Esteban Schenneider", R.drawable.esteban, "Un lugar de encuentro de muchas culturas ante una imponente estructura iconica del mundo, una capital unica.")
        )
)