/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.tmg.androsovych.datahub64.grouping.impl;

import com.hybris.datahub.model.RawItem;
import com.hybris.datahub.grouping.GroupingHandler;
import com.hybris.datahub.model.CompositionGroup;

import java.util.List;

public class SampleGroupingHandler implements GroupingHandler
{
	@Override
	public <T extends RawItem> List<CompositionGroup<T>> group(final CompositionGroup<T> tCompositionGroup)
	{
		return null;
	}

	@Override
	public <T extends RawItem> boolean isApplicable(final CompositionGroup<T> tCompositionGroup)
	{
		return false;
	}

	@Override
	public int getOrder()
	{
		return 0;
	}
}
