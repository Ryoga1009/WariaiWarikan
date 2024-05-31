package atoms

import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.RateTarget
import org.jetbrains.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TargetChip(
    target: RateTarget,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    Chip(
        modifier = modifier,
        onClick = onClick,
    ) {
        Text(text = "${target.name}: ${target.rate}")
    }

}

@Composable
@Preview
fun TargetChipPreview() {
    TargetChip(RateTarget("りょうが", 4))
}