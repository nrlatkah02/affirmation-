package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation


class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation("ban pecah", R.drawable.image1),
            Affirmation("cameron highland", R.drawable.image2),
            Affirmation("sepang", R.drawable.image3),
            Affirmation("siam thailand", R.drawable.image4),
            Affirmation("perda tech", R.drawable.image5),
            Affirmation("taman tasik", R.drawable.image6),
            Affirmation("seoul korean", R.drawable.image7),
            Affirmation("zoo taiping", R.drawable.image8),
            Affirmation("lake town bukit merah", R.drawable.image9),
            Affirmation("genting highland", R.drawable.image10)
        )
    }
}