package ru.yandex.incoming34.quarter4Homework5.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Mark {

	@ApiModelProperty
	public PossibleMark possibleMark;

	@ApiModel
	enum PossibleMark {
		insufficient, sufficient, good, perfect
	}

}
