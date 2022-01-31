package pramod.jetpackcompose.util


val String.color
    get() = androidx.compose.ui.graphics.Color(android.graphics.Color.parseColor(this))
