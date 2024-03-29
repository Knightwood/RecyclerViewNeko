package com.kiylx.recyclerviewneko.wrapper.pagestate.base

import androidx.collection.SparseArrayCompat

/**
 * 状态页的全局配置
 */
object GlobalWrapperConfig {
    /**
     * 全局的view列表
     */
    val wrappedViewArr: SparseArrayCompat<PageStateWrapperView> = SparseArrayCompat()

    init {
        //todo 内置添加默认的状态页
    }

    /**
     * dsl配置状态页
     */
    fun configStateView(block: SparseArrayCompat<PageStateWrapperView>.() -> Unit): GlobalWrapperConfig {
        wrappedViewArr.block()
        return this
    }
}

/**
 * 如果某[PageStateTypes]类型的值已存在，则进行替换
 */
operator fun SparseArrayCompat<PageStateWrapperView>.set(pageStateTypes: PageStateTypes, wrapperView: PageStateWrapperView) {
    wrapperView.type=pageStateTypes
    put(pageStateTypes.i, wrapperView)
}

operator fun SparseArrayCompat<PageStateWrapperView>.get(pageStateTypes: PageStateTypes): PageStateWrapperView? {
   return get(pageStateTypes.i)
}