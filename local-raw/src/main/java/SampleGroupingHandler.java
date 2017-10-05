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

import java.util.List;

import com.hybris.datahub.grouping.GroupingHandler;
import com.hybris.datahub.model.CompositionGroup;
import com.hybris.datahub.model.RawItem;

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
