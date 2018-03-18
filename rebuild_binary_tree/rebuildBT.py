#*_* coding:utf-8 *_*

#二叉树结点
class BinTreeNode(object):
	def __init__(self,data):
		self.data = data
		self.l = None
		self.r = None


#重建二叉树
class RBT(object):
    
	def __init__(self,pre,tin):
		self.pre = pre
		self.tin=tin
	
	def rebuildTree(self,pre,tin):
		if len(pre)==0:
			return None
		if len(pre)==1:
			return BinTreeNode(pre[0])
		res = BinTreeNode(pre[0])
		res.l = self.rebuildTree(pre[1: tin.index(pre[0]) + 1], tin[: tin.index(pre[0])])
		res.r = self.rebuildTree(pre[tin.index(pre[0]) + 1: ], tin[tin.index(pre[0]) + 1: ])
		return res

# pre=?
# tin=?
# test
