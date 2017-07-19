---
layout:     post
title:      "reverse-liked-list-ii"
subtitle:   "linked-list"
date:       2017-06-07 15:35:00
author:     "Rrrrsss"
header-img: "img/post-bg-2015.jpg"
tags:
    - 学习
---

### 就是为了这一道题来搞的博客，到现在终于弄完了，可以把这道题写上来做一个学习笔记。#

Description:Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:

Given1->2->3->4->5->NULL, m = 2 and n = 4,

return1->4->3->2->5->NULL.

Note:

Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.



	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode pre = dummy;
	    for(int i = 0; i < m-1; i++) {
	        pre = pre.next;
	    }
	    ListNode start = pre.next;
	    ListNode then = start.next;
	    for(int i = 0; i < n-m; i++) {
	        start.next = then.next;
	        then.next = pre.next;
	        pre.next = then;
	        then = start.next;
	    }
	    return dummy.next;
	}

### 这一题其实思路感觉挺简单的就是一个逆序的问题，值得注意的是在第二个循环的第三步then的next不能直接指向start而是要指向pre的next，至于为什么我也不清楚啦。#
