package com.alessiocameroni.pixely_components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PixelyListItem(
    modifier: Modifier,
    stringHeadlineText: String,
    stringSupportingText: String? = null,
    leadingUnit: @Composable (() -> Unit?)? = null,
    trailingUnit: @Composable (() -> Unit?)? = null
) {
    Row(
        modifier = modifier
            .padding(horizontal = 5.dp)
            .fillMaxWidth()
            .defaultMinSize(minHeight = 80.dp),
    ) {
        if (leadingUnit != null && trailingUnit != null) {
            // Both Units and Text
            Box(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .padding(end = 5.dp)
                    .size(60.dp),
                contentAlignment = Alignment.Center
            ) {
                leadingUnit()
            }

            if (stringSupportingText != null) {
                Column(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 14.dp)
                        .weight(1f)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )

                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringSupportingText,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp
                    )
                }
            } else {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .padding(start = 5.dp)
                    .size(60.dp),
                contentAlignment = Alignment.Center
            ) {
                trailingUnit()
            }

        } else if (leadingUnit != null) {
            // Leading Unit and Text
            Box(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .padding(end = 5.dp)
                    .size(60.dp),
                contentAlignment = Alignment.Center
            ) {
                leadingUnit()
            }

            if (stringSupportingText != null) {
                Column(
                    modifier = Modifier
                        .padding(top = 16.dp, end = 20.dp, bottom = 14.dp)
                        .weight(1f)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )

                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringSupportingText,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp
                    )
                }
            } else {
                Column(
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .weight(1f)
                        .height(80.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )
                }
            }

        } else if(trailingUnit != null) {
            // Trailing Unit and Text
            if (stringSupportingText != null) {
                Column(
                    modifier = Modifier
                        .padding(top = 16.dp, start = 20.dp, bottom = 14.dp)
                        .weight(1f)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )

                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringSupportingText,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp
                    )
                }
            } else {
                Column(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .weight(1f)
                        .height(80.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .padding(start = 5.dp)
                    .size(60.dp),
                contentAlignment = Alignment.Center
            ) {
                trailingUnit()
            }

        } else {
            // Only Text
            if (stringSupportingText != null) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp, vertical = 15.dp)
                        .weight(1f)
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )

                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringSupportingText,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp
                    )
                }
            } else {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .weight(1f)
                        .height(80.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringHeadlineText,
                        style = MaterialTheme.typography.titleLarge,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}