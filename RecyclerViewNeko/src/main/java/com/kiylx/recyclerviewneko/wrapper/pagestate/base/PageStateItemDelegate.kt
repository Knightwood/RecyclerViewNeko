package com.kiylx.recyclerviewneko.wrapper.pagestate.base

import android.view.View

fun interface PageStateItemDelegate {
    /**
     * 对状态页view的操作，例如给状态页设置点击事件
     */
    fun convert(itemView: View)
}