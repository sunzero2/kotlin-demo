fun isLetterString(s: String?): Boolean {
    if (s == null) {
        return false
    }

    if (s.isEmpty()) {
        return false
    }

    for (ch in s) {
        if (!ch.isLetter()) {
            return false
        }
    }

    return true
}

fun describeNumber(n: Int?) = when (n) {
    null -> "null"
    in 0..10 -> "small"
    else -> "out of range"
}

fun isSingleChar(s: String?) = s != null && s.length == 1