package molecles

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import atoms.TargetChip
import model.RateTarget

@Composable
fun TargetChipList(
    modifier: Modifier = Modifier,
    targetList: List<RateTarget> = listOf(),
    onChipClicked: () -> Unit = {},
) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(targetList) { target ->
            TargetChip(
                target = target,
                modifier = modifier,
                onClick = onChipClicked
            )
        }
    }
}