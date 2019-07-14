package com.cqjtu.bookstore.bean;

import java.util.Date;

public class ChapterInfo extends BaseBean {

	private String chapterId;
	private String chapterName;
	private String chapterContent;
	private Integer chapterCount;
	private Integer chapterOrder;
	private Date createDate;
	private NovelInfo novelInfo;

	public String getChapterId() {
		this.setOrder(this.chapterOrder);
		return chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getChapterContent() {
		return chapterContent;
	}

	public void setChapterContent(String chapterContent) {
		this.chapterContent = chapterContent;
	}

	public Integer getChapterCount() {
		return chapterCount;
	}

	public void setChapterCount(Integer chapterCount) {
		this.chapterCount = chapterCount;
	}

	public Integer getChapterOrder() {
		return chapterOrder;
	}

	public void setChapterOrder(Integer chapterOrder) {
		this.chapterOrder = chapterOrder;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public NovelInfo getNovelInfo() {
		return novelInfo;
	}

	public void setNovelInfo(NovelInfo novelInfo) {
		this.novelInfo = novelInfo;
	}

}
