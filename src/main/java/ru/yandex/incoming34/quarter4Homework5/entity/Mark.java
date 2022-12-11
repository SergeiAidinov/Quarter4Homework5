package ru.yandex.incoming34.quarter4Homework5.entity;

import io.swagger.annotations.ApiModel;

@ApiModel
public class Mark {

	public static PossibleMark possibleMark;

	@ApiModel
	public enum PossibleMark {
		insufficient, sufficient, good, perfect
	}

}
